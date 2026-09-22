package com.jgames.demo.minesweeper.service;

import org.springframework.stereotype.Service;

import com.jgames.demo.minesweeper.domain.Board;
import com.jgames.demo.minesweeper.vo.request.FlagRequest;
import com.jgames.demo.minesweeper.vo.request.Level;
import com.jgames.demo.minesweeper.vo.request.MinesweeperRequest;
import com.jgames.demo.minesweeper.vo.response.MinesweeperResponse;

import jakarta.servlet.http.HttpSession;

@Service
public class MinesweeperServiceImpl implements MinesweeperService {
	
	@Override
	public void reset(HttpSession session, Level level) {
		session.setAttribute("minesweeper", Board.reset(level));
	}
	
	@Override
	public MinesweeperResponse openCell(MinesweeperRequest request, Board board) {
		return board.openCell(request);
	}
	
	@Override
	public boolean toggleFlag(FlagRequest request, Board board) {
		return board.toggleFlag(request);
	}
}
