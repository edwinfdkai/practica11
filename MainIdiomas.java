package practica_adicional_11;

import java.util.Scanner;

public class MainIdiomas {

	public static void main(String[] args) {
		
		
		int id=0;
		Menu menu=new Menu();
		BD bd=new BD();
		Scanner teclado=new Scanner(System.in);
		
		int continuar = 1;
		int opcion=0;
		IIdioma iidioma; 
		IdiomasEnum idiomaEnum;
		String strIdioma;
		opcion=teclado.nextInt();
		if(opcion==1) {
			bd.precargarDatos();
			opcion=0;
		}else {
			System.out.println(" \n \n ****Se ha iniciado sin precargar ningun dato*** \n \n");
			opcion=0;
		}
		
		while (continuar == 1) {
			menu.menuPrincipal();
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
//				menu.insertarUnaPersona();
				
				System.out.println(" Digite el nombre de la persona \n \n ");
				String nombre = teclado.next();
				System.out.println(" \n Digite el apellido de la persona \n ");
				String apellido = teclado.next();

				menu.idiomaPersona();
				opcion = teclado.nextInt();
				strIdioma = menu.opcionIdioma(opcion);

				
				idiomaEnum = IdiomasEnum.valueOf(strIdioma);
				iidioma = idiomaEnum.getIdioma();
				Persona p1 = new Persona(iidioma, nombre, apellido);

				bd.ingresarUnaPersona(p1);
				break;

			case 2:
				System.out.println("Digite el id de la persona a eliminar \n");

				id = teclado.nextInt();
				bd.borrarUnaPersona(id);
				break;
			case 3:
				System.out.println("\n Digite el id de la persona a actualizar ");

				id = teclado.nextInt();

				System.out.println("\n Digite el nombre de la persona \n");
				nombre = teclado.next();
				System.out.println("\n Digite el apellido de la persona \n ");
				apellido = teclado.next();

				menu.idiomaPersona();
				opcion = teclado.nextInt();
				strIdioma = menu.opcionIdioma(opcion);

				idiomaEnum = IdiomasEnum.valueOf(strIdioma);
				iidioma = idiomaEnum.getIdioma();
				Persona p2 = new Persona(iidioma, nombre, apellido);
				bd.actualizarDatosPersona(id, p2);
				break;
			case 4:

				menu.idiomaPersona();
				opcion = teclado.nextInt();
				strIdioma = menu.opcionIdioma(opcion);

				System.out.println(" Digite el id de la persona \n");
				id = teclado.nextInt();
				idiomaEnum = IdiomasEnum.valueOf(strIdioma);
				iidioma = idiomaEnum.getIdioma();
				bd.ensenarIdioma(iidioma, id);
				break;

			case 5:
				bd.listarPersona();

				System.out.println(" \n \n Desea seguir en el programa ?");
				System.out.println("\n Presione 1 si desea seguir ");
				System.out.println("\n Presione otra letra si no desea seguir \n \n");

				continuar = teclado.nextInt();
				break;

			default:
				System.out.println("\n  No has selecciona ninguna opcion");
				break;

			}
			;

		}

		System.out.println(" Programa terminado");
		teclado.close();
		
	}
}
//		String idiomaStr = "ING";
//
//		IIdioma iidioma; 
//		
//		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaStr);
//		
//		iidioma = idiomaEnum.getIdioma();
//		
//		Persona juan = new Persona(iidioma, "juan", "lopez");
//		
//		//iidioma = IdiomasEnum.ING.getIdioma();
//		
//		//juan.aprender(iidioma);
//			
//		iidioma = IdiomasEnum.CHI.getIdioma();
//		
//		juan.aprender(iidioma);
//		
//		//juan.decir();
//		juan.decirEn(IdiomasEnum.ING.getIdioma());
	


