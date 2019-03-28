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
	public void display(final GLAutoDrawable arg0) { // 画图函数
 
		// TODO Auto-generated method stub
 
		float red = (float) (Math.random() * 1.0f); // 随机红
 
		float green = (float) (Math.random() * 1.0f); // 随机绿
 
		float blue = (float) (Math.random() * 1.0f); // 随机蓝
 
		final GL2 gl = (GL2) arg0.getGL(); // 从GLAutoDrawable获取GL
 
		gl.glClear(GL.GL_COLOR_BUFFER_BIT); // 填充背景颜色
 
		gl.glPointSize(5.0f); // 设置点的大小
 
		for (int i = 0; i < 50; i++) { // 画点
 
			red -= .09f; // 红色值递减
 
			green -= .12f; // 绿色值递减
 
			blue -= .15f; // 蓝色值递减
 
			if (red < 0.15) {
				red = 1.0f;
			}
 
			if (green < 0.15) {
				green = 1.0f;
			}
 
			if (blue < 0.15) {
				blue = 1.0f;
			}
 
			gl.glColor3f(red, green, blue); // 设置GL的画图颜色，也就是画刷的颜色
 
			gl.glBegin(GL.GL_POINTS);
 
			gl.glVertex2i(i * 10, 150); // 画点由glBegin(GL.GL_POINTS)开始，glEnd()结束
 
			gl.glEnd();
 
		}
 
	}
 
	public void displayChanged(final GLAutoDrawable arg0, final boolean arg1, final boolean arg2) {
 
		// TODO Auto-generated method stub
 
	}
 
	@Override
	public void init(final GLAutoDrawable gld) { // 初始函数
 
		// TODO Auto-generated method stub
 
		final GL gl = gld.getGL();
 
		final GLU glu = new GLU();
 
		gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // 设置背景颜色
 
		gl.glViewport(0, 0, 500, 300); // 视点大小
 
		((GLMatrixFunc) gl).glMatrixMode(GL2.GL_PROJECTION);
 
		((GLMatrixFunc) gl).glLoadIdentity();
 
		glu.gluOrtho2D(0.0, 500.0, 0.0, 300.0); // 使坐标系统出现在GL里
 
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
