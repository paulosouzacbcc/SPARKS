/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arquivo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static util.AbreExcel.pathDiretorio;

/**
 *
 * @author gtiago
 */
public class LeituraExcel {

    private static final String fileCelebracao = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Celebração.xlsx";
    private static final String fileFormasExpresao = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Formas de Expressão.xlsx";
    private static final String fileHistoriaVida = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Historias de Vida.xlsx";
    private static final String fileLugares = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Lugares.xlsx";
    private static final String fileOficios = "C:/Users/gtiago/Downloads/estagio/planilhasdadocumentao/Planilha Documentação_Oficios e Modos de Fazer.xlsx";

    public static void main(String[] args) throws IOException {

        LeituraExcel leituraExcel = new LeituraExcel();

        try {
            leituraExcel.lerExcel();
        } catch (IOException ex) {
            Logger.getLogger(LeituraExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lerExcel() throws IOException {

        List<Arquivo> listaArquivos = new ArrayList<>();

        int j = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(LeituraExcel.fileLugares));

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

                        case 1:
                            cell.setCellType(CellType.STRING);
                            arquivo.setNumeroRegistro(cell.getStringCellValue());
                            j += 1;
                            System.out.println(j);
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
                    //imprimir somente arquivo

                }
                // imprimir listarquivo

            }

            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
        }

    }
}
