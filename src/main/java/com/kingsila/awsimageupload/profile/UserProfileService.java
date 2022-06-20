package com.kingsila.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired

    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();

    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {

        //Check if image is empty
        //2 if file is image
        //3 The user exists in our database
        //4 Grab some metadata from file if any
        //5 Store the image in s3 and update the db with(UserProfileImageLink) s3 image link
    }
}
