package practica_adicional_11;

import java.util.Map;
import java.util.TreeMap;

public class BD {
	
	Map<Integer, Persona> listaPersona=new TreeMap<Integer, Persona>();
	IIdioma iidioma; 
	IdiomasEnum idiomaEnum;
	
	
	public Map<Integer, Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(Map<Integer, Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}
	
	public void precargarDatos() {
		String idiomaStr = "ING";

		idiomaEnum = IdiomasEnum.valueOf(idiomaStr);
		
		iidioma = idiomaEnum.getIdioma();
		
		Persona p1=new Persona(iidioma,"Andrea","Torres");
		Persona p2=new Persona(iidioma,"Miguel","Romero");
		Persona p3=new Persona(iidioma,"Claudia","Saavedra");
		Persona p4=new Persona(iidioma,"Ramiro","Perez");
		Persona p5=new Persona(iidioma,"Leo","Rodriguez");
		Persona p6=new Persona(iidioma,"Camila","Tolosa");
		Persona p7=new Persona(iidioma,"Cecilia","Gaviria");
		Persona p8=new Persona(iidioma,"Andres","Paez");
		
		listaPersona.put(1,p1);
		listaPersona.put(2,p2);
		listaPersona.put(3,p3);
		listaPersona.put(4,p4);
		listaPersona.put(5,p5);
		listaPersona.put(6,p6);
		listaPersona.put(7,p7);
		listaPersona.put(8,p8);
		
		System.out.println("\n \n ******Datos precargados exitosamente*****");
	}
	
	public void ingresarUnaPersona(Persona p1) {
		
		Integer key;
		key=1+listaPersona.size();
		listaPersona.put(key,p1);
		
		System.out.println("\n Persona ingresada exitosamente");

	}
	
	public void borrarUnaPersona(Integer id) {
		listaPersona.remove(id);
		System.out.println("\n Persona eliminada correctamente");
	}
	
	public void actualizarDatosPersona(Integer id,Persona p1) {
		listaPersona.replace(id, p1);
		System.out.println("\n Persona actualizada correctamente");
	}
	
	public void ensenarIdioma(IIdioma iidioma,Integer id) {
		
		Persona p1;
		p1=listaPersona.get(id);
		p1.aprender(iidioma);
		listaPersona.replace(id, p1);
		
		System.out.println("\n La persona ha aprendido un nuevo idioma");
	}

	public void listarPersona() {
		
		for(int i=1;i<=listaPersona.size();i++) {
			Persona p1=listaPersona.get(i);
			System.out.println(" -------------------\n \n");
			System.out.println("Id :"+i+"\n");
			System.out.println("Nombre : "+p1.getNombre()+"\n");
			System.out.println("Apellido : "+p1.getApellido()+"\n");
			p1.decir();

		}
		
		
	}
	
}
