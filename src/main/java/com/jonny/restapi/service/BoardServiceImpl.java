package com.jonny.restapi.service;

import com.jonny.restapi.domain.BoardVO;
import com.jonny.restapi.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    private final SqlSession sqlSession;

    public BoardServiceImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Transactional(readOnly = true)
    public List<BoardVO> getBoardItems() throws Exception {
        BoardMapper bm = sqlSession.getMapper(BoardMapper.class);
        return bm.getBoardItems();
    }

    @Transactional(readOnly = true)
    public BoardVO getBoard(Integer id) throws Exception {
        BoardMapper bm = sqlSession.getMapper(BoardMapper.class);
        return bm.getBoard(id);
    }

    @Transactional
    public int insertBoard(BoardVO param) throws Exception {
        BoardMapper bm = sqlSession.getMapper(BoardMapper.class);
        return bm.insertBoard(param);
    }

    @Transactional
    public int updateBoard(BoardVO param) throws Exception {
        BoardMapper bm = sqlSession.getMapper(BoardMapper.class);
        return bm.updateBoard(param);
    }

    @Transactional
    public int deleteBoard(Integer id) throws Exception {
        BoardMapper bm = sqlSession.getMapper(BoardMapper.class);
        return bm.deleteBoard(id);
    }
}
