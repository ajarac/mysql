package edu.upc.eetac.dsa.ajarac.EjMySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PieceDao {
	private static DbConnection conexion = new DbConnection();

	public static void main(String args[]) throws SQLException {
		ResultSet resultado;

		ArrayList<Piece> pieceList = new ArrayList<Piece>();
		resultado = conexion.getQuery("SELECT * FROM Pieces;");

		while (resultado.next()) {
			Piece p = new Piece();
			p.setCode(Integer.parseInt(resultado.getString("Code")));
			p.setName(resultado.getString("Name"));
			pieceList.add(p);
		}
		pintar(pieceList);

	}

	private static void pintar(ArrayList<Piece> pieceList) {
		for (int i = 0; i < pieceList.size(); i++) {
			Piece p = pieceList.get(i);
			System.out.println("Nombre pieza: " + p.getName() + " Codigo: "
					+ p.getCode());

		}

	}
}
