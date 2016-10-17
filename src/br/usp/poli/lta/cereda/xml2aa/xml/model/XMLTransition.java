/**
 * ------------------------------------------------------
 *    Laboratório de Linguagens e Técnicas Adaptativas
 *       Escola Politécnica, Universidade São Paulo
 * ------------------------------------------------------
 *
 * This program is free software: you can redistribute it
 * and/or modify  it under the  terms of the  GNU General
 * Public  License  as  published by  the  Free  Software
 * Foundation, either  version 3  of the License,  or (at
 * your option) any later version.
 *
 * This program is  distributed in the hope  that it will
 * be useful, but WITHOUT  ANY WARRANTY; without even the
 * implied warranty  of MERCHANTABILITY or FITNESS  FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 *
 */
package br.usp.poli.lta.cereda.xml2aa.xml.model;

/**
 * Especificação XML de uma transição do autômato
 * adaptativo.
 *
 * @author Paulo Roberto Massa Cereda
 * @version 1.0
 * @since 1.0
 */
public class XMLTransition {

    // atributos da classe
    private String from;
    private String symbol;
    private String to;
    private String call;
    private XMLActionCall preAdaptiveFunction;
    private XMLActionCall postAdaptiveFunction;

    /**
     * Getter.
     *
     * @return Objeto.
     */
    public XMLActionCall getPreAdaptiveFunction() {
        return preAdaptiveFunction;
    }

    /**
     * Setter.
     *
     * @param preAdaptiveFunction Função adaptativa
     * anterior.
     */
    public void setPreAdaptiveFunction(XMLActionCall preAdaptiveFunction) {
        this.preAdaptiveFunction = preAdaptiveFunction;
    }

    /**
     * Getter.
     *
     * @return Objeto.
     */
    public XMLActionCall getPostAdaptiveFunction() {
        return postAdaptiveFunction;
    }

    /**
     * Setter.
     *
     * @param postAdaptiveFunction Função adaptativa
     * posterior.
     */
    public void setPostAdaptiveFunction(XMLActionCall postAdaptiveFunction) {
        this.postAdaptiveFunction = postAdaptiveFunction;
    }

    /**
     * Getter.
     *
     * @return Objeto.
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Setter.
     *
     * @param symbol Símbolo.
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter.
     *
     * @return Objeto.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Setter.
     *
     * @param from Estado de origem.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Getter.
     *
     * @return Objeto.
     */
    public String getTo() {
        return to;
    }

    /**
     * Setter.
     *
     * @param to Estado de destino.
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Getter.
     *
     * @return Objeto.
     */
    public String getCall() {
        return call;
    }

    /**
     * Setter.
     *
     * @param call Chamada de submáquina.
     */
    public void setCall(String call) {
        this.call = call;
    }

}
