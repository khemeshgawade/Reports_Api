package com.khemesh.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.khemesh.request.SearchRequest;
import com.khemesh.response.SearchResponse;

public interface ReportService {

	public List<String> getUniquePlanNames();

	public List<String> getUniquePlanStatuses();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse response)throws Exception;

	public void generatePdf(HttpServletResponse response) throws Exception;

}
