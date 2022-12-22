package com.jgr.proyecto.pedidos.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.proyecto.pedidos.modelo.Pedido;

/**
 * The Class PedidosServicio.
 */
public class PedidosServicio {

	/** The pedidos. */
	List<Pedido> pedidos;

	/**
	 * Pedidos servicio.
	 */
	public void pedidosServicio() {

		this.pedidos = new ArrayList<>();
	}

	/**
	 * Adds the pedido.
	 *
	 * @param ped the ped
	 * @return the optional
	 */
	public Optional<Pedido> addPedido(Pedido ped) {

		Optional<Pedido> pedRet = null;

		if (this.buscaPedido(ped).get() != null) {
			this.pedidos.add(ped);
			pedRet = Optional.ofNullable(ped);
		}

		return pedRet;
	}

	/**
	 * Aniade lista pedidos.
	 *
	 * @param pedidos the pedidos
	 * @return the iterable
	 */
	public List<Pedido> aniadeListaPedidos(List<Pedido> pedidosB) {

		if (this.pedidos != null) {
			List<Pedido> temporal = new ArrayList<>();
			temporal = this.pedidos;
			this.pedidos = Stream.concat(temporal.stream(), pedidosB.stream()).collect(Collectors.toList());
		} else {
			this.pedidos = pedidosB;
		}

		return this.pedidos;

	}

	/**
	 * Busca pedido.
	 *
	 * @param ped the ped
	 * @return the optional
	 */
	public Optional<Pedido> buscaPedido(Pedido ped) {

		Optional<Pedido> pedRet = null;

		if (!pedidos.equals(ped)) {

			pedRet = Optional.ofNullable(ped);
		}
		return pedRet;

	}

	/**
	 * Busca pedido mas reciente.
	 *
	 * @return the pedido
	 */
	public Pedido buscaPedidoMasReciente() {

		Stream<Pedido> pedidosStream = pedidos.stream();

		return pedidosStream.max((a, b) -> a.getFecPedido().compareTo(b.getFecPedido())).get();

	}

	/**
	 * Devuelve pedidos.
	 *
	 * @return the list
	 */
	public List<Pedido> devuelvePedidos() {

		return this.pedidos;

	}

	/**
	 * Borra pedido.
	 *
	 * @param pedido the pedido
	 * @return true, if successful
	 */
	public boolean borraPedido(Pedido pedido) {
		return this.pedidos.remove(pedido);
	}

	/**
	 * Busca pedido por nombre stream.
	 *
	 * @param nombre the nombre
	 * @return the optional
	 */
	public Optional<Pedido> buscaPedidoPorNombreStream(String nombre) {
		return Optional.of(pedidos.stream().filter(c -> c.getNomProducto().equalsIgnoreCase(nombre)).findFirst().get());
	}

}
