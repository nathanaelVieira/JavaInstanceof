package application;

import entities.ClasseFilha;
import entities.ClasseMae;
import entities.MeuEnum;
import entities.MinhaInterface;

public class Program {

	public static void main(String[] args) {
	
		ClasseMae obj1 = null;
				
				System.out.println("obj1 instanceof Object: " + (obj1 instanceof Object));
				System.out.println("obj1 instanceof ClasseMae: " + (obj1 instanceof ClasseMae));
				System.out.println("obj1 instanceof ClasseFilha: " + (obj1 instanceof ClasseFilha));
				System.out.println("obj1 instanceof MinhaInterface: " + (obj1 instanceof MinhaInterface));
				
				ClasseMae obj2 = new ClasseMae();
				
				System.out.println("\nobj2 instanceof Object: " + (obj2 instanceof Object));
				System.out.println("obj2 instanceof ClasseMae: " + (obj2 instanceof ClasseMae));
				System.out.println("obj2 instanceof ClasseFilha: " + (obj2 instanceof ClasseFilha));
				System.out.println("obj2 instanceof MinhaInterface: " + (obj2 instanceof MinhaInterface));
				
				ClasseMae obj3 = new ClasseFilha();
				
				System.out.println("\nobj3 instanceof Object: " + (obj3 instanceof Object));
				System.out.println("obj3 instanceof ClasseMae: " + (obj3 instanceof ClasseMae));
				System.out.println("obj3 instanceof ClasseFilha: " + (obj3 instanceof ClasseFilha));
				System.out.println("obj3 instanceof MinhaInterface: " + (obj3 instanceof MinhaInterface));
				
				ClasseFilha obj4 = new ClasseFilha();
				
				System.out.println("\nobj4 instanceof Object: " + (obj4 instanceof Object));
				System.out.println("obj4 instanceof ClasseMae: " + (obj4 instanceof ClasseMae));
				System.out.println("obj4 instanceof ClasseFilha: " + (obj4 instanceof ClasseFilha));
				System.out.println("obj4 instanceof MinhaInterface: " + (obj4 instanceof MinhaInterface));
				
				MeuEnum e1 = null;
				
				System.out.println("\ne1 instanceof Object: " + (e1 instanceof Object));
				System.out.println("e1 instanceof MeuEnum: " + (e1 instanceof MeuEnum));
				System.out.println("e1 instanceof MinhaInterface: " + (e1 instanceof MinhaInterface));
				
				MeuEnum e2 = MeuEnum.MINHA_CONSTANTE_1;
				
				System.out.println("\ne2 instanceof Object: " + (e2 instanceof Object));
				System.out.println("e2 instanceof MeuEnum: " + (e2 instanceof MeuEnum));
				System.out.println("e2 instanceof MinhaInterface: " + (e2 instanceof MinhaInterface));
		}
}


