package P3;
public class test {
	public static void main(String[] args) {
		Estudiante [] array1 = new Estudiante [2];
		Profesor [] array2 = new Profesor [3];
		
		array1[0]= new Estudiante();
		array1[0].setNombre("Franisco");
		array1[0].setApellido("JOrge");
		array1[0].setComision(3);
		array1[0].setEmail("jorgefrancisco@gmail.com");
		array1[0].setDireccion("7 y 50");
		
		array1[1]= new Estudiante();
		array1[1].setNombre("Juan");
		array1[1].setApellido("Perla");
		array1[1].setComision(4);
		array1[1].setEmail("juanperla@gmail.com");
		array1[1].setDireccion("21 y 60");
		
		array2[0] = new Profesor();
		array2[0].setNombre("Raul");
		array2[0].setApellido("Shish");
		array2[0].setEmail("Raulshish@gmail.com");
		array2[0].setCatedra(4);
		array2[0].setFacultad("Informatica");
		
		array2[1] = new Profesor();
		array2[1].setNombre("diego");
		array2[1].setApellido("Shish");
		array2[1].setEmail("Diegoshish@gmail.com");
		array2[1].setCatedra(3);
		array2[1].setFacultad("Informatica");
		
		array2[2] = new Profesor();
		array2[2].setNombre("Saul");
		array2[2].setApellido("Goodman");
		array2[2].setEmail("SaulGoodman@gmail.com");
		array2[2].setCatedra(7);
		array2[2].setFacultad("Derecho");
		
		
		for (Estudiante a: array1) {
			System.out.println(a.tusDatos());
		}
		
		for (Profesor b: array2) {
			System.out.println(b.tusDatos());
		}
		
	}

}
