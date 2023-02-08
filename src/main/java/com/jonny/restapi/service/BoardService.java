package com.jonny.restapi.service;

import com.jonny.restapi.domain.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getBoardItems() throws Exception;

    BoardVO getBoard(Integer id) throws Exception;

    int insertBoard(BoardVO param) throws Exception;

    int updateBoard(BoardVO param) throws Exception;

    int deleteBoard(Integer id) throws Exception;
}
