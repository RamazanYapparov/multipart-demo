package com.example.multipartdemo;

import com.example.api.ServerApi;
import com.example.models.PayloadOne;
import com.example.models.PayloadTwo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ServerController implements ServerApi {

    @Override
    public ResponseEntity<Void> someNormalOperation(PayloadOne payloadOne) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> uploadSomeFile(MultipartFile file, PayloadTwo payload) {
        return ResponseEntity.ok().build();
    }
}
