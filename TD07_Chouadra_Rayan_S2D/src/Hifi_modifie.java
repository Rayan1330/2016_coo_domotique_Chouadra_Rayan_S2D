class Hifi {

	private int son = 0;

	public void allumer() {
		this.son += 10;
		if (this.son > 100)
			this.son = 100;
	}

	public void eteindre() {
		this.son = 0;
	}

	public void augmenterSon() {
		this.son += 5;
		if (this.son > 100)
			this.son = 100;
	}

	public void baisserSon() {
		this.son -= 5;
		if (this.son < 0)
			this.son = 0;
	}

	public String toString() {
		return "Hifi:" + son;
	}
}