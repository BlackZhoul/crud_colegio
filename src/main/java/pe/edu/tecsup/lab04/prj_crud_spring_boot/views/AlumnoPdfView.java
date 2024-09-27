package pe.edu.tecsup.lab04.prj_crud_spring_boot.views;

import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.entites.Alumno;

import java.awt.*;
import java.util.List;
import java.util.Map;

@Component("alumno/verAlumno")
public class AlumnoPdfView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
                                    HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Alumno> alumnos = (List<Alumno>)model.get("alumnos");

        PdfPTable tabla = new PdfPTable(1);
        tabla.setSpacingAfter(20);

        PdfPCell cell = null;

        cell = new PdfPCell(new Phrase("Lista de alumnos"));
        cell.setBackgroundColor(new Color(184, 218, 255));
        cell.setPadding(8f);
        tabla.addCell(cell);

        PdfPTable tabla2 = new PdfPTable(3);
        //tabla2.setWidths(new float [] {3.5f, 1, 1, 1});
        tabla2.addCell("id");
        tabla2.addCell("nombre");
        tabla2.addCell("apellido");

        for(Alumno alumno: alumnos) {
            tabla2.addCell(""+alumno.getId());
            tabla2.addCell(alumno.getNombre());
            tabla2.addCell(""+alumno.getApellido());
        }
        document.add(tabla);
        document.add(tabla2);
    }
}
