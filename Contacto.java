public class Contacto implements Comparable<Contacto>{

	private String _nombre;
	private int _numero;
	private String _profesion;


	public Contacto(String nombre, int numero, String profesion)
	{
		_nombre = nombre;
		_numero = numero;
		_profesion = profesion;

	}

	public String get_nombre()
	{
		return _nombre;
	}

	public void set_nombre(String _nombre)
	{
		this._nombre = _nombre;
	}

	public int get_numero()
	{
		return _numero;
	}

	public void set_numero(int _numero)
	{
		this._numero = _numero;
	}

	public String get_profesion()
	{
		return _profesion;
	}

	public void set_profesion(String _profesion)
	{
		this._profesion = _profesion;
	}

	@Override
	public String toString() {
		return "Contactos: Nombre: " + _nombre + ", Numero: " + _numero + ", Profesion: " + _profesion + "\n";
	}

	@Override
	public int compareTo(Contacto c1)
	{
		//orden alfabetico
		return _nombre.compareTo(c1.get_nombre());
	}
}
