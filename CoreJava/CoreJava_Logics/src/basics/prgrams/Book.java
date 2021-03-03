package basics.prgrams;

class Book {
	int pages;
	Book(int pages)
	{
		this.pages=pages;
	}
	@Override
	public String toString()
	{
		return "pages:"+pages;
		
	}
	@Override
	public boolean equals(Object arg0)
	{
		if (!(arg0 instanceof Book)) return false;
		return pages==((Book) arg0).pages;
		
	}

}
