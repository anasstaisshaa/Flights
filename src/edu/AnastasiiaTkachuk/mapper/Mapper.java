package edu.AnastasiiaTkachuk.mapper;

public interface Mapper<F, T>{
    T mapFrom(F object);

}
