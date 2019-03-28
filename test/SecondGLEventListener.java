package test;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;
import com.jogamp.opengl.glu.GLU;

public class SecondGLEventListener implements GLEventListener {
 
	public SecondGLEventListener() {
 
		// TODO Auto-generated constructor stub
 
	}
 
	@Override
	public void display(final GLAutoDrawable arg0) { // ��ͼ����
 
		// TODO Auto-generated method stub
 
		float red = (float) (Math.random() * 1.0f); // �����
 
		float green = (float) (Math.random() * 1.0f); // �����
 
		float blue = (float) (Math.random() * 1.0f); // �����
 
		final GL2 gl = (GL2) arg0.getGL(); // ��GLAutoDrawable��ȡGL
 
		gl.glClear(GL.GL_COLOR_BUFFER_BIT); // ��䱳����ɫ
 
		gl.glPointSize(5.0f); // ���õ�Ĵ�С
 
		for (int i = 0; i < 50; i++) { // ����
 
			red -= .09f; // ��ɫֵ�ݼ�
 
			green -= .12f; // ��ɫֵ�ݼ�
 
			blue -= .15f; // ��ɫֵ�ݼ�
 
			if (red < 0.15) {
				red = 1.0f;
			}
 
			if (green < 0.15) {
				green = 1.0f;
			}
 
			if (blue < 0.15) {
				blue = 1.0f;
			}
 
			gl.glColor3f(red, green, blue); // ����GL�Ļ�ͼ��ɫ��Ҳ���ǻ�ˢ����ɫ
 
			gl.glBegin(GL.GL_POINTS);
 
			gl.glVertex2i(i * 10, 150); // ������glBegin(GL.GL_POINTS)��ʼ��glEnd()����
 
			gl.glEnd();
 
		}
 
	}
 
	public void displayChanged(final GLAutoDrawable arg0, final boolean arg1, final boolean arg2) {
 
		// TODO Auto-generated method stub
 
	}
 
	@Override
	public void init(final GLAutoDrawable gld) { // ��ʼ����
 
		// TODO Auto-generated method stub
 
		final GL gl = gld.getGL();
 
		final GLU glu = new GLU();
 
		gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // ���ñ�����ɫ
 
		gl.glViewport(0, 0, 500, 300); // �ӵ��С
 
		((GLMatrixFunc) gl).glMatrixMode(GL2.GL_PROJECTION);
 
		((GLMatrixFunc) gl).glLoadIdentity();
 
		glu.gluOrtho2D(0.0, 500.0, 0.0, 300.0); // ʹ����ϵͳ������GL��
 
	}
 
	public void reshape1(final GLAutoDrawable arg0, final int arg1, final int arg2, final int arg3,final int arg4) {
 
		// TODO Auto-generated method stub
 
	}

	public void display1(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	public void init1(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}
 
}
