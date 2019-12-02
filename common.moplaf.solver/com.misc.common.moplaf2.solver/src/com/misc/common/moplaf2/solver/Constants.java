package com.misc.common.moplaf2.solver;

public interface Constants {
	
	static int VAR_TYPE_CONTINUOUS = 1;
	static int VAR_TYPE_INTEGER = 2;
	
	static int CONS_TYPE_LINEAR_LEQ = 1;
	static int CONS_TYPE_LINEAR_GEQ = 2;
	static int CONS_TYPE_LINEAR_EQ = 4;

	static int GOAL_MINIMIZE = 1;
	static int GOAL_MAXIMIZE = 2;
	static int GOAL_CONSTRAINT = 4;
}
