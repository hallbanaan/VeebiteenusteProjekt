/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttu.movie;

import ee.ttu.idu0075._2015.ws.movie.AddMovieRequest;
import ee.ttu.idu0075._2015.ws.movie.AddStatusMovieRequest;
import ee.ttu.idu0075._2015.ws.movie.AddStatusRequest;
import ee.ttu.idu0075._2015.ws.movie.GetMovieListRequest;
import ee.ttu.idu0075._2015.ws.movie.GetMovieListResponse;
import ee.ttu.idu0075._2015.ws.movie.GetMovieRequest;
import ee.ttu.idu0075._2015.ws.movie.GetStatusListRequest;
import ee.ttu.idu0075._2015.ws.movie.GetStatusListResponse;
import ee.ttu.idu0075._2015.ws.movie.GetStatusMovieListRequest;
import ee.ttu.idu0075._2015.ws.movie.GetStatusRequest;
import ee.ttu.idu0075._2015.ws.movie.MovieType;
import ee.ttu.idu0075._2015.ws.movie.StatusMovieListType;
import ee.ttu.idu0075._2015.ws.movie.StatusMovieType;
import ee.ttu.idu0075._2015.ws.movie.StatusType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Kersti
 */
@WebService(serviceName = "MovieService", portName = "InvoicePort", endpointInterface = "ee.ttu.idu0075._2015.ws.movie.StatusPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/movie", wsdlLocation = "WEB-INF/wsdl/MovieWebServices/MovieService.wsdl")
public class MovieWebServices {

    private int nextMovieId = 1;
static List<MovieType> movieList = new ArrayList<MovieType>();
private int nextStatusId = 1;
static List<StatusType> statusList = new ArrayList<StatusType>();
   
static List<StatusMovieListType> statusMovieTypeList = new ArrayList<StatusMovieListType>();

    public MovieType getMovie(GetMovieRequest parameter) {
    MovieType mt = null;
        if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
            for (int i =0; i < movieList.size(); i++){
                if(movieList.get(i).getId().equals(parameter.getId())){
                    mt = movieList.get(i);
    }
            }
        }
        return mt;
    }

    public MovieType addMovie(AddMovieRequest parameter) {
    MovieType mt = new MovieType();
    if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
        mt.setDirector(parameter.getDirector());
        mt.setGenre(parameter.getGenre());
        mt.setName(parameter.getName());
        mt.setReleaseYear(parameter.getReleaseYear());
        mt.setId(BigInteger.valueOf(nextMovieId++));
        movieList.add(mt);
        }
        return mt;
    }

    public GetMovieListResponse getMovieList(GetMovieListRequest parameter) {
     GetMovieListResponse response = new GetMovieListResponse();
    if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
         for (MovieType movieType : movieList){
             response.getMovie().add(movieType);
            }
        }
        return response;
    }

    public StatusType getStatus(GetStatusRequest parameter) {
    StatusType st = null;
    if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
        for (int i = 0; 1 < statusList.size(); i++){
            if (statusList.get(i).getId().equals(parameter.getId())){
                st = statusList.get(i);
                }
            }
        }
        return st;
    }

    public StatusType addStatus(AddStatusRequest parameter) {
    StatusType st = new StatusType();
    if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
        st.setStatus(parameter.getStatus());
        st.setId(BigInteger.valueOf(nextStatusId++));
        statusList.add(st);
        }
    return st;
    }

    public GetStatusListResponse getStatusList(GetStatusListRequest parameter) {
    GetStatusListResponse response = new GetStatusListResponse();
    if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
        for (StatusType statusType : statusList){
            response.getStatus().add(statusType);
        }
    }
    return response;
    }

    public StatusMovieListType getStatusMovieList(GetStatusMovieListRequest parameter) {
    StatusMovieListType sml = new StatusMovieListType();
    if (parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
        StatusType status;
        status = getStatus(parameter.getStatusId());
        sml = status.getStatusMovieList();
    }
    return sml;
    }

    public StatusMovieType addStatusMovie(AddStatusMovieRequest parameter) {
    StatusMovieType smt = new StatusMovieType();
    if(parameter.getToken().equalsIgnoreCase("HALLBANAAN")){
        smt.setMovie(getMovie(parameter.getMovieId()));
    }
    StatusType status = getStatus(parameter.getStatusId());
    if(status !=null && smt.getMovie() != null){
        if(status.getStatusMovieList() ==null){
            status.setStatusMovieList(new StatusMovieListType());
        }
        status.getStatusMovieList().getStatusMovie().add(smt);
    }
    return smt;
    }
    
private StatusType getStatus(BigInteger id){
    StatusType st = null;
    for (StatusType status : statusList){
        if (status.getId().equals(id)){
            st = status;
	}
    }
    return st;
}

private MovieType getMovie(BigInteger id){
    MovieType mt = null;
    for(MovieType movie: movieList){
        if(movie.getId().equals(id)){
            mt = movie;
            }
        }
    return mt;
    }
}
