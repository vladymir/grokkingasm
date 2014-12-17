import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.objectweb.asm.ClassReader;


public class Teste {
	public Teste() {
		
	}
//	
//	void metodoUm(int arg0) throws RuntimeException{
//		try {
//			System.out.println("vlad");
//			throw new RuntimeException();
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//		}
//	}
	
//	int metodoDois() {
//		return 0;
//	}
//	
	void metodoTres()  {
		try{
			ClassReader cr = new ClassReader(new FileInputStream("test.class"));
			cr.equals(null);
		} catch(IOException e) {
			e.printStackTrace();
			IllegalArgumentException ex = new IllegalArgumentException();
			System.out.println("aaa");
			throw ex;
		}
	}
}
