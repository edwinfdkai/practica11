package practica_adicional_11;

public class Menu {
	
	public Menu() {
		menuInicio();
	}


	public void menuInicio() {
		
		System.out.println(" EL SIGUIENTE PROGRAMA ADMINISTRA PERSONAS Y LOS IDIOMAS QUE HABLAN \n");
		
		System.out.println("\n A continuacion escoja si desea precargar personas o persona iniciar la aplicacion sin datos \n \n");
		System.out.println("1. Presione (1) si desea precargar los datos ");
		System.out.println("2. Presione (2) si desea iniciar el programa sin datos ");
	}
	
	
	public void menuPrincipal() {
		System.out.println(" ************** MENU PRINCIPAL ************");
		System.out.println(" \n Presiona el numero de la accion que desea realizar \n");
		System.out.println(" 1. Ingresar un persona \n");
		System.out.println(" 2. Borrar una persona \n");
		System.out.println(" 3. Actualizar datos de una persona \n");
		System.out.println(" 4. Enseñarle un idioma a una persona \n");
		System.out.println(" 5. listar las personas y los idiomas que hablan \n");
		
	}
	public void idiomaPersona() {
		System.out.println(" \n Digite el idioma de la persona \n \n");
		System.out.println(" 1. Español \n");
		System.out.println(" 2. Ingles \n");
		System.out.println(" 3. Italiano \n");
		System.out.println(" 4. Chino \n");
		System.out.println(" 5. Frances \n");
	}
//	public void insertarUnaPersona() {
//		System.out.println("\n Digite el nombre de la persona \n");
//		
//		System.out.println("\n Digite el apellido de la persona \n");
//	
//	}
	public String opcionIdioma(int opcion) {
		
		String strIdioma="";
		if(opcion==1) {
			strIdioma="ES";
		}
		if(opcion==2) {
			strIdioma="ING";
		}
		if(opcion==3) {
			strIdioma="ITA";
		}
		if(opcion==4) {
			strIdioma="CHI";
		}
		if(opcion==5) {
			strIdioma="FRA";
		}
		
		
		return strIdioma;
	}
}
