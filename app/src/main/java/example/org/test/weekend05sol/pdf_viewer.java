package example.org.test.weekend05sol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf_viewer extends AppCompatActivity {
    PDFView pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        pdfViewer = (PDFView)findViewById(R.id.idPdfViewer);
        pdfViewer.fromAsset("linkedininterviewebook10-11-17.pdf").load();

    }
}
