/**
* �ļ��ظ��ʼ��
* Author: FruitBasket
* Time: 2013/5/1
* Email: FruitBasket@qq.com
* Source code: github.com/Fruit-Basket
*/

package checking;

/**
 * ������
 * @author FruitBasket
 *
 */
public class Checking {
	
	private int min(int i, int j) {
		return i>j?j:i;
	}
	
	/**
	 * ���������ı��ı༭����
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int editingDistance(String str1, String str2){
		int max1=str1.length();
		int max2=str2.length();
		
		int matrix[][]=new int[max1][max2];
		int i,j;
		for(i=0;i<max1;i++){
			matrix[i][0]=i;
		}
		for(j=0;j<max2;j++){
			matrix[0][j]=j;
		}
		for(i=1;i<max1;i++){
			for(j=1;j<max2;j++){
				int d;
	            int temp = min(matrix[i-1][j] + 1, matrix[i][j-1] + 1);
	            if(str1.charAt(i-1) == str2.charAt(j-1))
	            {
	                d = 0 ;
	            }
	            else
	            {
	                d = 1 ;
	            }
	            matrix[i][j] = min(temp, matrix[i-1][j-1] + d);
			}
		}
		return matrix[max1-1][max2-1];
		
	}

	public float repetitiveRate(float length1,float length2,float editingDistance){//�����ظ���
		return (1-(editingDistance/(length1+length2)));
	}
	
	public float getRepetitiveRate(String str1,String str2){//�õ��ظ���
		return repetitiveRate(str1.length(),str2.length(),editingDistance(str1,str2));
	}

}
