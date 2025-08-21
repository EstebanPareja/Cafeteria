package co.edu.uniquindio.poo.cafeteriajfx;


import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private String nombre, nit;
    private List<Persona> listPersonas;
    private List<Producto> listProductos;
    private List<Pedido> listPedidos;

    private Cafeteria () {
        this.nombre = "UQ HANGAR";
        this.nit = "112233";
        this.listPersonas= new ArrayList<>();
        this.listProductos = new ArrayList<>();
    }

    /**
     * Metodo para validar la existencia de una persona en una lista
     * @param persona
     * @return boolean
     */

    public boolean verificarPersonaExiste(Persona persona) {
        for (Persona usuario : listPersonas) {
            if (persona.getId().equals(usuario.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para agregar una persona a una lista
     * @param persona
     * @return boolean
     */
    public boolean agregarPersona(Persona persona) {
        if (verificarPersonaExiste(persona)) {
            return false;
        } else {
            listPersonas.add(persona);
            return true;
        }
    }

    /**
     * Metodo para eliminar a una persona de una lista
     * @param id
     * @return boolean
     */

    public boolean eliminarPersona(String id) {
        for (int i = 0; i < listPersonas.size(); i++) {
            if (listPersonas.get(i).getId().equals(id)) {
                listPersonas.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para actualizar a una persona de una lista
     * @param id
     * @param persona
     * @return boolean
     */
    public boolean actualizarPersona(String id, Persona persona) {
        for (int i = 0; i < listPersonas.size(); i++) {
            if (listPersonas.get(i).getId().equals(id)) {
                listPersonas.set(i, persona);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para mostrar una persona de una lista
     * @param id
     * @return persona
     */
    public Persona mostrarPersona(String id) {
        for (Persona persona : listPersonas) {
            if (persona.getId().equals(id)) {
                return persona;
            }
        }
        return null;
    }

    /**
     * Metodo para validar la existencia de un producto en una lista
     * @param producto
     * @return boolean
     */

    public boolean verificarProductoExiste(Producto producto) {
        for (Producto product : listProductos) {
            if (producto.getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para agregar un producto a una lista
     * @param producto
     * @return boolean
     */
    public boolean agregarProducto(Producto producto) {
        if (verificarProductoExiste(producto)) {
            return false;
        } else {
            listProductos.add(producto);
            return true;
        }
    }

    /**
     * Metodo para eliminar un producto de una lista
     * @param id
     * @return boolean
     */

    public boolean eliminarProducto(String id) {
        for (int i = 0; i < listProductos.size(); i++) {
            if (listProductos.get(i).getId().equals(id)) {
                listProductos.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para actualizar un producto de una lista
     * @param id
     * @param producto
     * @return boolean
     */
    public boolean actualizarProducto(String id, Producto producto) {
        for (int i = 0; i < listProductos.size(); i++) {
            if (listProductos.get(i).getId().equals(id)) {
                listProductos.set(i, producto);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para mostrar un producto de una lista
     * @param id
     * @return producto
     */
    public Producto mostrarProducto(String id) {
        for (Producto producto : listProductos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Metodo para validar la existencia de un pedido en una lista
     * @param pedido
     * @return boolean
     */

    public boolean verificarPedidoExiste(Pedido pedido) {
        for (Pedido order : listPedidos) {
            if (pedido.getId().equals(order.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para agregar un pedido a una lista
     * @param pedido
     * @return boolean
     */
    public boolean agregarPedido(Pedido pedido) {
        if (verificarPedidoExiste(pedido)) {
            return false;
        } else {
            listPedidos.add(pedido);
            return true;
        }
    }

    /**
     * Metodo para eliminar un pedido de una lista
     * @param id
     * @return boolean
     */

    public boolean eliminarPedido(String id) {
        for (int i = 0; i < listPedidos.size(); i++) {
            if (listPedidos.get(i).getId().equals(id)) {
                listPedidos.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para actualizar un pedido de una lista
     * @param id
     * @param pedido
     * @return boolean
     */
    public boolean actualizarPedido(String id, Pedido pedido) {
        for (int i = 0; i < listPedidos.size(); i++) {
            if (listPedidos.get(i).getId().equals(id)) {
                listPedidos.set(i, pedido);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para mostrar un pedido de una lista
     * @param id
     * @return pedido
     */
    public Pedido mostrarPedido(String id) {
        for (Pedido pedido : listPedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(List<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }
}
