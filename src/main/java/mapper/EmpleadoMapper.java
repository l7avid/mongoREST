package mapper;

import DTO.EmpleadoDTO;
import collections.Empleado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoMapper {

    public Empleado fromDTO(EmpleadoDTO dto) {
        Empleado empleado = new Empleado();
        empleado.setId(dto.getId());
        empleado.setNombre(dto.getNombre());
        empleado.setRol(dto.getRol());
        return empleado;
    }

    public EmpleadoDTO fromCollection(Empleado empleado) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setId(empleado.getId());
        empleadoDTO.setNombre(empleado.getNombre());
        empleadoDTO.setRol(empleado.getRol());
        return empleadoDTO;
    }

    public List<EmpleadoDTO> fromCollectionList(List<Empleado> collection) {
        if (collection == null) {
            return null;

        }
        List<EmpleadoDTO> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while(listTracks.hasNext()) {
            Empleado empleado = (Empleado)listTracks.next();
            list.add(fromCollection(empleado));
        }

        return list;
    }
}
