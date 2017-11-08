/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author gtiago
 *
 *
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Arquivo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AbreExcel {
    
    private static final String fileCelebracao = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Celebração.xlsx";
    private static final String fileName2 = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Formas de Expressão.xlsx";
    private static final String fileName3 = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Historias de Vida.xlsx";
    private static final String fileName4 = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Lugares-Final.xlsx";
    private static final String fileName5 = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Oficios e Modos de Fazer.xlsx";
    //private static final String fileName = "C:/Users/gtiago/Downloads/estagio/teste.xlsx";

    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    static List<File> listFiles = new ArrayList<>();
    static List<String> listPathFiles = new ArrayList<>();
    
    static String pathDiretorio;
    
    public void lerExcel() throws IOException {
        List<Arquivo> listaArquivos = new ArrayList<>();
        
        pathDiretorio = sparks.SPARKS.getDiretorio();
        
        listFilesFilter();
        
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(AbreExcel.fileCelebracao));
            
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            
            XSSFSheet sheetAlunos = workbook.getSheetAt(0);
            
            Iterator<Row> rowIterator = sheetAlunos.iterator();
            
            while (rowIterator.hasNext()) {
                
                Row row = rowIterator.next();
                
                Iterator<Cell> cellIterator = row.cellIterator();
                
                Arquivo arquivo = new Arquivo();
                listaArquivos.add(arquivo);
                
                while (cellIterator.hasNext() && row.getRowNum() > 0) {
                    Cell cell = cellIterator.next();
                    
                    switch (cell.getColumnIndex()) {
                        
                        case 0:
                            arquivo.setIndicacaoDataHora(cell.getDateCellValue());
                            break;
                        case 1:
                            cell.setCellType(CellType.STRING);
                            arquivo.setNumeroRegistro(cell.getStringCellValue());
                            break;
                        case 2:
                            cell.setCellType(CellType.STRING);
                            arquivo.setNumeroCatalogacao(cell.getStringCellValue());
                            break;
                        case 4:
                            cell.setCellType(CellType.NUMERIC);
                            arquivo.setData((int) cell.getNumericCellValue());
                            break;
                        case 5:
                            arquivo.setCategoriaObjeto(cell.getStringCellValue());
                            break;
                        case 6:
                            arquivo.setCategoriaReferencia(cell.getStringCellValue());
                            break;
                        case 7:
                            arquivo.setQualidadeDados(cell.getStringCellValue());
                            break;
                        case 8:
                            arquivo.setResponsavelEdicao(cell.getStringCellValue());
                            break;
                        case 9:
                            arquivo.setExtensaoArquivo(cell.getStringCellValue());
                            break;
                        case 10:
                            arquivo.setAquisicao(cell.getStringCellValue());
                            break;
                        case 11:
                            arquivo.setAutorizacao(cell.getStringCellValue());
                            break;
                        case 12:
                            cell.setCellType(CellType.STRING);
                            arquivo.setTitulo(cell.getStringCellValue());
                            break;
                        case 13:
                            cell.setCellType(CellType.STRING);
                            arquivo.setLocalProducaoCidade(cell.getStringCellValue());
                            break;
                        case 14:
                            cell.setCellType(CellType.STRING);
                            arquivo.setLocalProducaoLocalizacao(cell.getStringCellValue());
                            break;
                        case 15:
                            
                            arquivo.setDataProducaoData(cell.getDateCellValue());
                            break;
                        case 17:
                            cell.setCellType(CellType.STRING);
                            arquivo.setTempoDuracao(cell.getStringCellValue());
                            break;
                        case 18:
                            cell.setCellType(CellType.STRING);
                            arquivo.setEmpresaProdutora(cell.getStringCellValue());
                            break;
                        case 19:
                            cell.setCellType(CellType.STRING);
                            arquivo.setEquipeRealizadora(cell.getStringCellValue());
                            break;
                        case 20:
                            cell.setCellType(CellType.STRING);
                            arquivo.setDescricaoInformacao(cell.getStringCellValue());
                            break;
                        case 21:
                            cell.setCellType(CellType.STRING);
                            arquivo.setPalavraChave(cell.getStringCellValue());
                            break;
                        case 22:
                            cell.setCellType(CellType.STRING);
                            arquivo.setResponsavelDocumentacaoUnidade(cell.getStringCellValue());
                            break;
                        case 23:
                            cell.setCellType(CellType.STRING);
                            arquivo.setResponsavelDocumentacaoNome(cell.getStringCellValue());
                            break;
                        case 24:
                            arquivo.setResponsavelDocumentacaoData(cell.getDateCellValue());
                            break;
                        case 29:
                            cell.setCellType(CellType.STRING);
                            arquivo.setObservacoes(cell.getStringCellValue());
                            break;
                        case 30:
                            cell.setCellType(CellType.STRING);
                            arquivo.setOrigemDosDados(cell.getStringCellValue());
                            break;
                    }
                    
                }
                
            }
            fileInputStream.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
        }
        
        if (listaArquivos.size() == 0) {
            System.out.println("Nenhum aluno encontrado!");
        } else {
            
            for (int i = 0; i < listFiles.size(); i++) {
                for (int j = 0; j < listaArquivos.size(); j++) {
                    
                    if (listFiles.get(i).getName().substring(0, listFiles.get(i).getName().lastIndexOf(".")).equalsIgnoreCase(listaArquivos.get(j).getNumeroCatalogacao())) {
                        listaArquivos.get(j).setUrl(FtpUrlUpload.upload(listFiles.get(i).getAbsolutePath(), listFiles.get(i).getName(), pathDiretorio.substring(pathDiretorio.lastIndexOf("\\"), pathDiretorio.length()).substring(1)));
                        facade.FacadeJpa.getInstance().getArquivo().create(listaArquivos.get(j));
                        
                    }
                }
            }
        }
    }
    
    static void listFilesFilter() {
        
        File folder = new File(pathDiretorio);

        //Implementing FilenameFilter to retrieve only txt files
        FilenameFilter txtFileFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".JPG")) {
                    return true;
                } else if (name.endsWith(".MOV")) {
                    return true;
                } else if (name.endsWith(".MP4")) {
                    return true;
                } else if (name.endsWith(".AVI")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        //Passing txtFileFilter to listFiles() method to retrieve only txt files
        File[] files = folder.listFiles(txtFileFilter);
        
        for (File file : files) {
            listFiles.add(file);
            
        }
    }
}
