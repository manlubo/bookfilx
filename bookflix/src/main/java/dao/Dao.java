package dao;

public interface Dao<T> {
	// 등록 메서드
	void insert(T t);
	
	// 선택 메서드
	T selectOne(int no);
}
