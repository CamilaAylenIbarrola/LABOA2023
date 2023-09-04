import java.util.ArrayList;

public class TiendaElectronica {
    ArrayList<Producto>listaProductos;

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void agregarProducto(Producto productoNuevo){
        listaProductos.add(productoNuevo);
    }
    public void modificarProducto(Producto productoModificado, Producto productoAModificar){
        int contador=0;
        for(Producto producto: listaProductos){
            if(producto.equals(productoAModificar)){
                listaProductos.add(contador, productoModificado);
            }
            contador++;
        }
    }
    public void eliminarProducto(Producto productoEliminar){
        listaProductos.remove(productoEliminar);
    }
    public void mayorStock(){
        int mayor=0;
        String nombre="";
        for(Producto producto: listaProductos){
            if(producto.getStock()>mayor){
                mayor=producto.getStock();
                nombre=producto.getNombre();
            }
        }
        System.out.println("El producto de mayor Stock es " + nombre);
    }
    public void menorStock(){
        int menor=0;
        String nombre="";
        for(Producto producto: listaProductos){
            if(producto.getStock()<menor){
                menor=producto.getStock();
                nombre=producto.getNombre();
            }
        }
        System.out.println("El producto de menor Stock es " + nombre);
    }
}
