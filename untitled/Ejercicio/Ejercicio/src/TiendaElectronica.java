package Ejercicio.src;

import java.util.ArrayList;
import java.util.HashSet;

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
    public void disminuirStock(Componente producto){
        producto.setStock(producto.getStock()-1);
    }
    public void hacerCompra(HashSet<Componente>listaCompra){
        boolean cpu=false;
        boolean dispEntrada=false;
        boolean dispSalida=false;

        for(Componente componente:listaCompra){
            try {
                disminuirStock(componente);
                if(componente.getStock()<0){
                    componente.setStock(0);
                    throw new NullPointerException("No hay stock");
                }
            }catch (NullPointerException e){
                System.err.println(e);
            }
            if(componente instanceof  CPU){
                cpu=true;
            }else if(componente instanceof DispSalida){
                dispSalida=true;
            }else if(componente instanceof  DispEntrada){
                dispEntrada=true;
            }
        }
        try {
            if (!cpu && !dispSalida && !dispEntrada) {
                throw new IllegalArgumentException("No se puede realizar la compra por faltar los componentes principal");
            }
        }catch (IllegalArgumentException err){
            System.err.println(err);
        }
    }
}
