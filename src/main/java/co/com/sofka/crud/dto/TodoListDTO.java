package co.com.sofka.crud.dto;

import co.com.sofka.crud.entities.Todo;
import java.util.List;

public class TodoListDTO {
    private Long idDTO;
    private String nameDTO;
    private List<Todo> todosDTO;

    public Long getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(Long idDTO) {
        this.idDTO = idDTO;
    }

    public String getNameDTO() {
        return nameDTO;
    }

    public void setNameDTO(String nameDTO) {
        this.nameDTO = nameDTO;
    }

    public List<Todo> getTodosDTO() {
        return todosDTO;
    }

    public void setTodosDTO(List<Todo> todosDTO) {
        this.todosDTO = todosDTO;
    }
}
