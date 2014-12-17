import java.io.FileInputStream;
import java.io.PrintWriter;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.TraceClassVisitor;
import org.objectweb.asm.commons.AnalyzerAdapter;

public class Main {
	public static void main(String[] args) {
		try {
			ClassReader cr = new ClassReader(new FileInputStream("Teste.class"));
			PrintWriter printer = new PrintWriter(System.out);
			TraceClassVisitor trace = new TraceClassVisitor(printer);
			ClassPrinter cp = new ClassPrinter(trace);
			cr.accept(cp, ClassReader.EXPAND_FRAMES);
			for (byte ex : cr.b) {
				//System.out.println(ex);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
