package test;




import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;
import com.jogamp.opengl.util.FPSAnimator;
 
@SuppressWarnings({ "serial", "unused" })
public class SecondJoglApp extends JFrame {
 
	public static FPSAnimator animator = null;
 
	public GLCanvas canvas = null;
 
	public SecondJoglApp() throws HeadlessException {
 
		super("JOGL:dot matrix");
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		// 初始化GLCapabilities
 
		final GLCapabilities glcaps = new GLCapabilities(null);
 
		canvas = new GLCanvas(glcaps); // 初试化GLcanvas,用法参照第一章
 
		canvas.addGLEventListener(new SecondGLEventListener()); // GLcanvas添加GLEventListener
 
		getContentPane().add(canvas, BorderLayout.CENTER); // 给窗体panel添加GLcanvas
 
		animator = new FPSAnimator(canvas, 10, true); // 本章重点，给canvas添加动画线程，每秒10帧
 
		setSize(500, 300);
 
		centerWindow(this);
 
	}
 
	public void centerWindow(final Component frame) { // 把窗体居中
 
		final Dimension screenSize =
 
		Toolkit.getDefaultToolkit().getScreenSize();
 
		final Dimension frameSize = frame.getSize();
 
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
 
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
 
		frame.setLocation(
 
		screenSize.width - frameSize.width >> 1,
 
		screenSize.height - frameSize.height >> 1
 
		);
 
	}
 
	public static void main(final String[] args) {
 
		// TODO Auto-generated method stub
 
		final SecondJoglApp app = new SecondJoglApp();
 
		// 显示窗体
 
		SwingUtilities.invokeLater(
 
		new Runnable() {
 
			@Override
			public void run() {
 
				app.setVisible(true);
 
			}
 
		}
 
		);
 
		SwingUtilities.invokeLater(
 
		new Runnable() {
 
			@Override
			public void run() {
 
				animator.start(); // 开始动画线程
 
			}
 
		}
 
		);
 
	}
 
}
