/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolavl;

/**
 *
 * @author carlareyes
 * @param <T>
 */
public interface PrintableNode <T extends Comparable<T>> {
    PrintableNode getIzq();
    PrintableNode getDer();
    T getElem();
}
