package dto;

import java.util.Date;
import model.Student;

import model.Student;

public class StudentDTO {
	
	private int index;
	
	private String ime;
	
	private String prezime;
	
	private String pol;
	
	private Date godina_rodjenja;
	
	private String sport;
	
	private String hobi;

	public StudentDTO() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDTO [index=" + index + ", ime=" + ime + ", prezime=" + prezime + ", pol=" + pol
				+ ", godina_rodjenja=" + godina_rodjenja + ", sport=" + sport + ", hobi=" + hobi + "]";
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Date getGodina_rodjenja() {
		return godina_rodjenja;
	}

	public void setGodina_rodjenja(Date godina_rodjenja) {
		this.godina_rodjenja = godina_rodjenja;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getHobi() {
		return hobi;
	}

	public void setHobi(String hobi) {
		this.hobi = hobi;
	}

	public StudentDTO(int index, String ime, String prezime, String pol, Date godina_rodjenja, String sport,
			String hobi) {
		super();
		this.index = index;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godina_rodjenja = godina_rodjenja;
		this.sport = sport;
		this.hobi = hobi;
	}
	
	public StudentDTO(Student student) {
		setIndex(student.getIndex());
		setIme(student.getIme());
		setPrezime(student.getPrezime());
		setGodina_rodjenja(student.getGodinaRodjenja());
		setHobi(student.getHobi());
		setSport(student.getSport());
		setPol(student.getPol());
	}
	

}
