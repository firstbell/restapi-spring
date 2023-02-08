package com.jonny.restapi.mapper;

import com.jonny.restapi.domain.BoardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    /**
     * 게시판 전체 리스트
     * @return List<BoardVO>
     * @throws Exception
     */
    public List<BoardVO> getBoardItems() throws Exception;

    /**
     * 게시판 특정 id 데이터
     * @return BoardVO
     * @throws Exception
     */
    public BoardVO getBoard(Integer id) throws Exception;

    /**
     * 게시판 등록
     * @return
     * @throws Exception
     */
    public int insertBoard(BoardVO param) throws Exception;

    /**
     * 게시판 수정
     * @return
     * @throws Exception
     */
    public int updateBoard(BoardVO param) throws Exception;

    /**
     * 게시판 삭제
     * @return
     * @throws Exception
     */
    public int deleteBoard(Integer id) throws Exception;

}
