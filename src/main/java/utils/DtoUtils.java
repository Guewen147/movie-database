package utils;

import java.util.ArrayList;
import java.util.List;

import dto.ActeurDto;
import dto.GenreDto;
import dto.LieuDto;
import dto.PaysDto;
import dto.RealisateurDto;
import dto.RoleDto;
import entite.Acteur;
import entite.Genre;
import entite.Lieu;
import entite.Pays;
import entite.Realisateur;
import entite.Role;

public class DtoUtils {
	
	public static Pays paysDtoToPays(PaysDto paysDto) {
		if (paysDto != null) {
			Pays pays = new Pays(paysDto.getNom(), paysDto.getUrl());
			return pays;
		}
		return null;
	}

	public static Lieu lieuDtoToLieu(LieuDto lieuDto) {
		if (lieuDto != null) {
			Lieu lieu = new Lieu(lieuDto.getVille(), lieuDto.getEtatDept(), paysDtoToPays(lieuDto.getPays()));
			return lieu;
		}
		return null;
	}

	public static Genre genreDtoToGenre(GenreDto genreDto) {
		Genre genre = new Genre(genreDto.getLibelle());
		return genre;
	}

	public static List<Genre> genreDtoListToGenreList(List<GenreDto> genreListDto) {
		List<Genre> genreList = new ArrayList<Genre>();
		for (GenreDto genres : genreListDto) {
			genreList.add(genreDtoToGenre(genres));
		}
		return genreList;
	}

	public static Acteur acteurDtoToActeur(ActeurDto acteurDto) {
		Acteur acteur = new Acteur(acteurDto.getIdentite(), acteurDto.getUrl(), acteurDto.getId(),
				acteurDto.getHeigth(), acteurDto.getDateNaissance(), lieuDtoToLieu(acteurDto.getLieuNaissance()));
		return acteur;

	}

	public static List<Acteur> acteurDtoListToActeurList(List<ActeurDto> acteurListDto) {
		List<Acteur> acteurList = new ArrayList<Acteur>();
		for (ActeurDto acteurs : acteurListDto) {
			acteurList.add(acteurDtoToActeur(acteurs));
		}
		return acteurList;
	}

	public static Role roleDtoToRole(RoleDto roleDto) {
		Role role = new Role(roleDto.getCharacterName());
		role.getActeursR().add(acteurDtoToActeur(roleDto.getActeur()));
		return role;
	}
	

	public static List<Role> roleDtoListToRoleList(List<RoleDto> roleListDto) {
		List<Role> roleList = new ArrayList<Role>();
		for (RoleDto roles : roleListDto) {
			roleList.add(roleDtoToRole(roles));
		}
		return roleList;
	}

	public static Realisateur realisateurDtoToRealisateur(RealisateurDto realisateurDto) {
		Realisateur realisateur = new Realisateur(realisateurDto.getIdentite(), realisateurDto.getUrl());
		return realisateur;
	}

	public static List<Realisateur> realisateurDtoListToRealisateurList(List<RealisateurDto> realisateurListDto) {
		List<Realisateur> realisateurList = new ArrayList<Realisateur>();
		for (RealisateurDto realisateurs : realisateurListDto) {
			realisateurList.add(realisateurDtoToRealisateur(realisateurs));
		}
		return realisateurList;
	}
}
