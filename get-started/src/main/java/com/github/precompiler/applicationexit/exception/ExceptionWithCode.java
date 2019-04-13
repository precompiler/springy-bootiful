package com.github.precompiler.applicationexit.exception;

import org.springframework.boot.ExitCodeGenerator;

public class ExceptionWithCode extends RuntimeException implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		return -99;
	}

}
