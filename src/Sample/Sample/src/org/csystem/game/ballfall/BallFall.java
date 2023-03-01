package org.csystem.game.ballfall;

public class BallFall {
	private String m_shape;

	private static boolean updateRightFlag(boolean isRight, int ballIndex, int width)
	{
		if (ballIndex == 0)
			isRight = true;
		else if (ballIndex == width - 1)
			isRight = false;
		
		return isRight;
	}
	
	private static int updateBallIndex(boolean isRight, int ballIndex)
	{
		if (isRight)
			return ballIndex + 1;
		
		return ballIndex - 1;
	}
	
	private void fillSpace(int begin, int end) //[begin, end)
	{
		for (int i = begin; i < end; ++i)
			m_shape += ' ';
	}
	
	private void fillBall(int ballIndex, int end)
	{
		fillSpace(0, ballIndex);
		m_shape += '*';
		fillSpace(ballIndex + 1, end);				
	}
	
	public BallFall()
	{
		m_shape = "";
	}

	public String getShape()
	{
		return m_shape;
	}

	public void play(int width, int height)
	{
		if (width <= 0 || height <= 0)
			throw new IllegalArgumentException("Invalid values!...");

		int ballIndex = 0;
		boolean isRight = false;
		
		m_shape = "";
		for (int i = 1; i <= height; ++i) {
			m_shape += '|';
			fillBall(ballIndex, width);
			if (width != 1) {
				isRight = updateRightFlag(isRight, ballIndex, width);
				ballIndex = updateBallIndex(isRight, ballIndex);
			}
			m_shape += "|\r\n";
		}
	}
}
