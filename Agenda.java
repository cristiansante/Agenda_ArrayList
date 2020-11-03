import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Agenda{

	private ArrayList<Contacto> _contactos;
	private ArrayList<Integer> _numeros;

	public Agenda()
	{
		_contactos = new ArrayList<Contacto>();
		_numeros = new ArrayList<Integer>();
	}

	public void agregarContacto(Contacto contacto)
	{
		if(existeNumero(contacto.get_numero()))
		{
			System.out.println("El contacto ya existe! \n");
		}
		else
		{
			_contactos.add(contacto);
			_numeros.add(contacto.get_numero());
			System.out.println("El contacto fue agregado con exito! \n");
		}
	}

	public boolean existeNumero(int codigo)
	{
		Iterator<Integer> it= _numeros.iterator();

		while(it.hasNext())
		{
			int numero= it.next();

			if (numero == codigo)
			{
				return true;
			}
		}
		return false;
	}

	public void eliminarContacto(int numero)
	{
		for(int i = 0; i < _contactos.size(); i++)
		{
			if(existeNumero(numero))
			{
				_numeros.remove(i);
				_contactos.remove(i);
				System.out.println("El contacto fue eliminado con exito! \n");
			}
			else
			{
				System.out.println("El contacto no existe! \n");
			}
		}
	}

	public int tamanio()
	{
		return _contactos.size();
	}

	public void mostrarContactos()
	{
		Collections.sort(_contactos);
		System.out.println(_contactos);
	}
}