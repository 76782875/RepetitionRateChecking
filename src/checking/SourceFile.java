/**
* �ļ��ظ��ʼ��
* Author: FruitBasket
* Time: 2013/5/1
* Email: FruitBasket@qq.com
* Source code: github.com/Fruit-Basket
*/

package checking;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��ȡԴ�ļ���
 * @author FruitBasket
 *
 */
public class SourceFile {
	
	private static StringBuffer article1=new StringBuffer();;
	private static StringBuffer article2=new StringBuffer();
	
	/*
	 * ��ȡfis�������article
	 * @param fis
	 * @param article
	 */
	private void readSourceFile(FileInputStream fis,StringBuffer article){//��ȡԴ�ļ�����
		try{
		InputStreamReader dis=new InputStreamReader(fis);
		BufferedReader reader=new BufferedReader(dis);
		String s;
		while( (s=reader.readLine())!=null){
			article.append(s);
		}
		dis.close();
		}catch(IOException e){
			System.exit(1);
		}
	}
	
	public void readArticle()throws IOException{//�׳��쳣
		this.readSourceFile(new FileInputStream("article1.txt"),article1);
		this.readSourceFile(new FileInputStream("article2.txt"),article2);
	}
	
	public String getArticle1(){//���������ַ���
		return article1.toString();
	}
	public String getArticle2(){//���������ַ���
		return article2.toString();
	}

}
