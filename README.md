grokkingasm
===========

## Metodo analisado
```
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
```
## Output
```
metodoTres()V
Throw exception
java/lang/IllegalArgumentException
}
```
