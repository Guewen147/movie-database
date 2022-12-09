package utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import dto.FilmDto;
import entite.Film;

public class Reader {
	
	
	public static List<Film> movieDatabaseGenerate() throws StreamReadException, IOException {

		List<Film> movieDataBase = new ArrayList<Film>();

		List<FilmDto> movieDataBaseDto = generateDto();

		for (FilmDto film : movieDataBaseDto) {
				movieDataBase.add(new Film(film.getId(), film.getNom(), film.getUrl(), film.getPlot(),film.getLangue(), film.getAnneeSortie(), 
						DtoUtils.paysDtoToPays(film.getPays()),DtoUtils.lieuDtoToLieu(film.getLieuTournage()), DtoUtils.genreDtoListToGenreList(film.getGenres()),
						DtoUtils.roleDtoListToRoleList(film.getRoles()), DtoUtils.acteurDtoListToActeurList(film.getActeurs()),DtoUtils.realisateurDtoListToRealisateurList(film.getRealisateurs())));
		}

		return movieDataBase;
	}

	public static List<FilmDto> generateDto() throws JsonParseException, JsonMappingException, IOException {
		
		File fichier = new File("C:\\Users\\guewe\\Downloads\\films.json");
		
		ObjectMapper mapper= new ObjectMapper();
		
		CollectionType collType= mapper.getTypeFactory().constructCollectionType(List.class, FilmDto.class);
		
		List<FilmDto> films= mapper.readValue(fichier, collType);
		
		return films;
	}
	
	
}
