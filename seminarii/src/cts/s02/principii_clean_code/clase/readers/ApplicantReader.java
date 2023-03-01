package cts.s02.principii_clean_code.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import cts.s02.principii_clean_code.clase.*;

public interface ApplicantReader {
	public abstract List<Aplicant> readApplicants(String fileName) throws FileNotFoundException, NumberFormatException;
}
