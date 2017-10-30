package matrix;

public class Matrix_lib {
	
	private double a[][], b[][];
	
	
	
	public Matrix_lib(double[][] a, double[][] b) {
		this.a = a;
		this.b = b;
	}

	public double [][] getProduct(){
		double answer[][] = new double[a.length][b[0].length];
		double t[][] = this.getTranspose(b);
		for(int i =0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				answer[i][j] = this.getInnerProduct(a[i], t[j]);
			}
		}
		return answer;
	}

	
	public double getInnerProduct(double a[],double b[]){ 
		double answer = 0;
		for(int i = 0; i < a.length; i++) {
			answer +=a[i]*b[i];
		}
		return answer;
	}
	
	
	public double [][] getTranspose(double b[][]) {
		double t[][] = new double[b[0].length][b.length];
		for(int i=0; i < b[0].length; i++) {
			for(int j = 0; j < b.length; j++) {
				t[i][j]=b[j][i];
			}
		}
		return t;
	}

}