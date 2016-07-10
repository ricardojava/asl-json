package com.example;

public class Origin {
	
	private String voo;
	private String data;
	private String hora;
	private String aeroporto;
	private String cidade;
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Origin [voo=" + voo + ", data=" + data + ", hora=" + hora + ", aeroporto=" + aeroporto + ", cidade="
				+ cidade + "]";
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @return the aeroporto
	 */
	public String getAeroporto() {
		return aeroporto;
	}
	/**
	 * @param aeroporto the aeroporto to set
	 */
	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the voo
	 */
	public String getVoo() {
		return voo;
	}
	/**
	 * @param voo the voo to set
	 */
	public void setVoo(String voo) {
		this.voo = voo;
	}
}
