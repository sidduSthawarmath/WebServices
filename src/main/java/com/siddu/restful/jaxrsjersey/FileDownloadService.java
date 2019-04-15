package com.siddu.restful.jaxrsjersey;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/file")
public class FileDownloadService {

	private static final String FILE_LOCATION = "D:/Workspace/WebServices/src/main/webapp/file";

	@GET
	@Path("/textfile")
	@Produces("text/plain")
	public Response textFileDownload(HttpServletRequest request) {

		File file = new File(FILE_LOCATION + "/textSampleFile.txt");
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"text_file.txt\"");
		return response.build();
	}

	@GET
	@Path("/image")
	@Produces("image/png")
	public Response imageDownload() {
		File file = new File(FILE_LOCATION + "/sample_image.png");
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"image.png\"");
		return response.build();
	}

	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response pdfFileDownload() {
		File file = new File(FILE_LOCATION + "/sample_pdf_file.pdf");
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"pdf_file.pdf\"");
		return response.build();
	}
}
