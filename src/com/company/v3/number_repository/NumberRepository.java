package com.company.v3.number_repository;


import java.io.IOException;

public interface NumberRepository {
    int[] read() throws IOException;//todo: change exception handling mechanism

}
