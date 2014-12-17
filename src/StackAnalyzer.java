import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.AnalyzerAdapter;


public class StackAnalyzer extends AnalyzerAdapter {

	MethodPrinter mv;
	public StackAnalyzer(String arg0, int arg1, String arg2, String arg3,
			MethodVisitor arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.mv = (MethodPrinter) arg4;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitMethodInsn(int arg0, String arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
		super.visitMethodInsn(arg0, arg1, arg2, arg3);
	}
	
	public void visitInsn(int arg0) {
		// TODO Auto-generated method stub
		if(arg0 == Opcodes.ATHROW) {
			System.out.println("Throw exception");
			System.out.println(stack.get(0));
			mv.setException((String)stack.get(0));
		}
		super.visitInsn(arg0);
	}
	
	@Override
	public void visitTryCatchBlock(Label arg0, Label arg1, Label arg2,
			String arg3) {
		// TODO Auto-generated method stub
//		super.visitTryCatchBlock(arg0, arg1, arg2, arg3);
		
		mv.visitTryCatchBlock(arg0, arg1, arg2, arg3);
	}
}
