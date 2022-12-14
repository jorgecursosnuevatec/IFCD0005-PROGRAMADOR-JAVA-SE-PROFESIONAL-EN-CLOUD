#!/bin/sh
#SUBIDA AUTOMATICA A GIT DE REPOSITORIO
# Git.sh
#
# Uso: ./git.sh
#
# Original: http://sekika.github.io/2016/06/06/github-many-files/
#
# Sin acentos*
# Registros
AddLog="/dev/null"
CommitLog="/dev/null"
PushLog="/dev/null"

# Mensaje
message=$@
if [ -z "$message" ]; then
message="$(date) 2022-12-13 leer y escribir archivos"
fi

start=`date +%s`

inicio_ns=`date +%s%N`
inicio=`date +%s`

# Haciendo los git add/commit/push por steps
git add .
git add *
git add -A
git maintenance start


while read a b c
do
  total=`find . -type f -size +$a -size -$b | grep -v "^\./\.git/" | wc -l | sed -e 's/ //g'`
  if [ $total -gt "0" ]; then
    echo "Archivos totales $total < $b                              "
  fi
  find . -type f -size +$a -size -$b | grep -v "^\./\.git/" | cat -n | while read num file
  do
    echo "Agregando: "`expr $num \* 100 / $total`"% ($num/$total)\r\c"
    git add "$file" 1>>$AddLog 2>>$AddLog
    if [ `echo $num | grep "$c"` ]; then
      echo "Agregando al commit $num                    \r\c"
      git commit -m "$message" 1>>$CommitLog 2>>$CommitLog; git push 1>>$PushLog 2>>$PushLog
    fi
  done
  if [ $total -gt "0" ]; then
    echo "Ultimo commit de esta etapa                \r\c"
    git commit -m "$message" 1>>$CommitLog 2>>$CommitLog; git push 1>>$PushLog 2>>$PushLog
  fi
done << _LIST_
0 8k 0000$
8k 80k 000$
80k 800k 00$
800k 8M 0$
8M 100M $
_LIST_

#
# Todos los archivos subidos, en esta etapa se intentan subir con LSF
#
echo "Concluyendo con los archivos mas grandes                       "

git add . 1>>$AddLog 2>>$AddLog
git commit -m "$message" 1>>$CommitLog 2>>$CommitLog; git push 1>>$PushLog 2>>$PushLog

# git_trace=true
git reflog expire --expire=now --all

# git gc --aggressive
# git gc --prune=now
git clean --f
git repack
git fsck
git count-objects -v
# git maintenance start
time git status

end=`date +%s`

runtime=$((end-start))%M

fin_ns=`date +%s%N`
fin=`date +%s`
let total_ns=$fin_ns-$inicio_ns
let total=$fin-$inicio
let total_min=($total/60)
echo "ha tardado: -$total_ns- nanosegudos, -$total- segundos, -$total_min- minutos  "

echo "Finalizado,hasta luego EJERCICIOS"