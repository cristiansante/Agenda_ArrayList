import java.util.Scanner;

public class Principal {
	private boolean _equis = true;
	private Agenda _agenda;

	public Principal()
	{
		_agenda = new Agenda();
	}

	public void ciclo()
	{
		while(_equis)
		{
			//mostrar opciones:
			System.out.println("Elegir una opcion: \n");
			System.out.println("Presione 1 para ver los contactos");
			System.out.println("Presione 2 para agregar un contacto");
			System.out.println("Presione 3 para eliminar un contacto");
			System.out.println("Presione cualquier otro numero para salir \n");

			//entrada por teclado
			String entradaTeclado = "";
	        Scanner entradaEscaner = new Scanner (System.in);
	        entradaTeclado = entradaEscaner.nextLine ();

	        //casteo de strin a int
			int entrada = Integer.parseInt(entradaTeclado);

			//muestro contactos
			if(entrada == 1)
			{
				_agenda.mostrarContactos();
				ciclo();
				entradaEscaner.close();
			}

			//agrego contacto
			if(entrada == 2)
			{
				System.out.println("Ingrese el nombre: ");
				String nombre = "";
				Scanner entradaNombre = new Scanner (System.in);
				nombre = entradaNombre.nextLine();

				System.out.println("Ingrese el numero: ");
				String num = "";
				Scanner entradaNumero = new Scanner (System.in);
				num = entradaNumero.nextLine();
				int numero = Integer.parseInt(num);

				System.out.println("Ingrese la profesion: ");
				String profesion = "";
				Scanner entradaProfesion = new Scanner (System.in);
				profesion = entradaProfesion.nextLine();

				//agregar a la agenda
				Contacto contacto = new Contacto(nombre, numero, profesion);
				_agenda.agregarContacto(contacto);

				ciclo();

				entradaNombre.close();
				entradaNumero.close();
				entradaProfesion.close();
			}

			//elimino un contacto
			if(entrada == 3)
			{
				System.out.println("Ingrese el numero: ");
				String num = "";
				Scanner entradaNumero = new Scanner (System.in);
				num = entradaNumero.nextLine();
				int numero = Integer.parseInt(num);

				_agenda.eliminarContacto(numero);

				ciclo();

				entradaNumero.close();
			}
			else
			{
				_equis = false;
			}
		}
	}
}
