package uz.darkor.darkor_22.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.darkor.darkor_22.dto.BaseDTO;
import uz.darkor.darkor_22.dto.GenericDTO;
import uz.darkor.darkor_22.response.Data;
import uz.darkor.darkor_22.utils.BaseUtils;

import javax.validation.Valid;
import java.io.Serializable;

public interface GenericCUDController<CD extends BaseDTO, UD extends GenericDTO, GD extends GenericDTO, K extends Serializable> {
    @RequestMapping(value = BaseUtils.CREATE_PATH, method = RequestMethod.POST)
    ResponseEntity<Data<GD>> create(@Valid @RequestBody CD DTO);

    @RequestMapping(value = BaseUtils.UPDATE_PATH, method = RequestMethod.PUT)
    ResponseEntity<Data<GD>> update(@Valid @RequestBody UD DTO);

    @RequestMapping(value = BaseUtils.DELETE_PATH, method = RequestMethod.DELETE)
    ResponseEntity<Data<Boolean>> delete(@PathVariable K code);
}
